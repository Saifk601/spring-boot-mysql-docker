package in.saifit.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "USER_MASTER")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class user {
	  
	  @Id
	  @Column(name = "USER_ID")
	  private Integer userid;
	  
	  @Column(name = "USER_NAME")
	  private String userName;
	  
	  @Column(name ="USER_GENDER")
	  private String userGender;
	  
	  @Column(name = "USER_AGE")
	  private Integer userAge;
	  
	  @Column(name = "COUNTRY")
	  private String country;

}
