package in.ashokit.app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Friend {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private  Integer  id;

    private  Long  phoneNumber;

    private  Long  friendNumber;

    private  String friendName;
}
