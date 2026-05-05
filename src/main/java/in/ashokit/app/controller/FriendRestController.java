package in.ashokit.app.controller;

import in.ashokit.app.entity.Friend;
import in.ashokit.app.service.FriendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(value = "/api/v1")
public class FriendRestController {
    @Autowired
    FriendService service;

    @PostMapping(value = "/friend-contact/add", produces = "application/json", consumes = "application/json")
    public ResponseEntity<Friend> addFriend(@RequestBody Friend  friend) {
        Friend newEntity = service.addFriendContact(friend);
        if ( newEntity != null )
            return  ResponseEntity.ok(newEntity);
        else
            return ResponseEntity.badRequest().build();
    }

    @GetMapping( value = "/friend-contacts/{phoneNumber}")
    public List<Object[]> getFriendsContacts(@PathVariable Long phoneNumber) {
        return service.readFriendsContacts(phoneNumber);
    }
}
