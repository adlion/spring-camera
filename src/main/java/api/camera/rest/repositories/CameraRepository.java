package api.camera.rest.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import org.springframework.stereotype.Repository;

import api.camera.rest.domain.Camera;

@Repository
public interface CameraRepository extends MongoRepository<Camera,String> {
    List<Camera> findByName(String name);
    List<Camera> findByResolution(String resolution);
    List<Camera> findByModel(String model);
    List<Camera> findByipAddress(String ipAddress);
}
