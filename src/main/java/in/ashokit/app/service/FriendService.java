package in.ashokit.app.service;

import in.ashokit.app.entity.Friend;
import in.ashokit.app.repository.FriendRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FriendService {
    @Autowired
    FriendRepository repository;

    public Friend addFriendContact(Friend friend) {

        Integer  count=repository.checkFriendContact(friend.getPhoneNumber(), friend.getFriendNumber());
        if(count==0) {
            friend = repository.saveAndFlush(friend);
            return  friend;
        }
        else {
            return null;
        }
    }

    public List<Object[]> readFriendsContacts(Long phoneNumber) {
        return  repository.findFriendsContactNumbers(phoneNumber);
    }
}
