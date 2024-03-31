package Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Video")
public class Video {

	@Id
	@Column(name = "Id")
	public int Id;
	
	@Column(name = "Title")
	public String Title;
	
	@Column(name = "Poster")
	public String Poster;
	
	@Column(name = "Views")
	public int Views;
	
}
