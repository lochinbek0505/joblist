package uz.falconmobile.joblisting.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import uz.falconmobile.joblisting.model.Post;

public interface PostRepository extends MongoRepository<Post,String> {
}
