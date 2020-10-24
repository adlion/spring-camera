package api.camera.rest.services;

import java.util.List;

import api.camera.rest.domain.Camera;

public interface CameraService {

    Camera findCameraById(String id);
    List<Camera> findCameraByIp(String ipAddress);
    List<Camera> findCameraByName(String name );
    List<Camera> findCameraByModel(String model);
    List<Camera> findCameraByResolution(String resolution);

    List<Camera> findAllCameras();

    Camera saveCamera(Camera camera);
    String deleteCamera(String id);
}
