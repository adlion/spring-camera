package api.camera.rest.controllers;

import java.util.List;
import java.util.Map;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import api.camera.rest.domain.Camera;
import api.camera.rest.services.CameraService;

@RestController
@RequestMapping(CameraController.BASE_URL)
public class CameraController {
    public static final String BASE_URL = "/api/v1/cameras";
    private final CameraService cameraService;

    public CameraController(CameraService cameraService) {
        this.cameraService = cameraService;
    }

    @GetMapping
    List<Camera> getAllCameras() {
        return cameraService.findAllCameras();
    }

    @GetMapping("/id/{param}")
    public Camera getCameraById(@PathVariable String param) {
        return cameraService.findCameraById(param);
    }

    @GetMapping("/name/{param}")
    public List<Camera> getCameraByName(@PathVariable String param) {
        return cameraService.findCameraByName(param);
    }

    @GetMapping("/model/{param}")
    public List<Camera> getCameraByModel(@PathVariable String param) {
        return cameraService.findCameraByModel(param);
    }

    @GetMapping("/resolution/{param}")
    public List<Camera> getCameraByResolution(@PathVariable String param) {
        return cameraService.findCameraByResolution(param);
    }

    @GetMapping("/ip/{param}")
    public List<Camera> getCameraByIp(@PathVariable String param) {
        return cameraService.findCameraByIp(param);
    }

    @PostMapping
    public ResponseEntity<Object> saveCamera(@RequestBody Camera camera) {
        cameraService.saveCamera(camera);
        return  ResponseEntity.status(HttpStatus.OK)
        .body(Map.of("message", "Camera Saved Successfully!","status","S1000"));
    }

    @DeleteMapping("/id/{id}")
    public ResponseEntity<Object> deleteCamera(@PathVariable String id) {
        String deletedId = cameraService.deleteCamera(id);
        return ResponseEntity.status(HttpStatus.OK)
                .body(Map.of("id", deletedId, "message", "Camera Deleted Successfully!","status","S1000"));

    }

    @PutMapping(value = "/{id}")
    public Camera update(@PathVariable String id, @RequestBody Camera updatedCamera) {
        Camera camera = cameraService.findCameraById(id);
        camera.setName(updatedCamera.getName());
        camera.setModel(updatedCamera.getModel());
        camera.setResolution(updatedCamera.getResolution());
        camera.setipAddress(updatedCamera.getipAddress());
        return cameraService.saveCamera(camera);
    }
}
