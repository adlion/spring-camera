package api.camera.rest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import api.camera.rest.domain.Camera;
import api.camera.rest.repositories.CameraRepository;

@Service
public class CameraServiceTmpl implements CameraService {
    @Autowired
    private final CameraRepository cameraRepository;

    public CameraServiceTmpl(CameraRepository cameraRepository) {
        this.cameraRepository = cameraRepository;
    }

    @Override
    public Camera findCameraById(String id) {
        return cameraRepository.findById(id).get();
    }

    @Override
    public List<Camera> findAllCameras() {
        return cameraRepository.findAll();
    }

    @Override
    public Camera saveCamera(Camera camera) {
        return cameraRepository.save(camera);
    }

    @Override
    public List<Camera> findCameraByIp(String ipAddress) {
        return cameraRepository.findByipAddress(ipAddress);

    }

    @Override
    public List<Camera> findCameraByName(String name) {
        return cameraRepository.findByName(name);

    }

    @Override
    public List<Camera> findCameraByModel(String model) {
        return cameraRepository.findByModel(model);
    }

    @Override
    public List<Camera> findCameraByResolution(String resolution) {
        return cameraRepository.findByResolution(resolution);
    }

    @Override
    public String deleteCamera(String id) {
        cameraRepository.deleteById(id);
        return id;
    }

}
