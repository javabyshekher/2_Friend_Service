package in.ashokit.app.repository;

import in.ashokit.app.entity.Friend;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FriendRepository extends JpaRepository<Friend, Integer> {
    @Query(value="SELECT COUNT(*) FROM FRIEND WHERE  PHONE_NUMBER=? AND FRIEND_NUMBER=?", nativeQuery=true)
    Integer  checkFriendContact(Long phoneNumber, Long friendNumber);

    @Query(value="SELECT FRIEND_NUMBER, FRIEND_NAME  FROM FRIEND WHERE PHONE_NUMBER=?", nativeQuery=true)
    List<Object[]> findFriendsContactNumbers(Long phoneNumber);
}
