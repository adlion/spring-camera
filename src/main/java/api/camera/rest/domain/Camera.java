package api.camera.rest.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "camera")
public class Camera {

    @Id
    private String id;

    private String name;
    private String model;
    private String resolution;
    private String ipAddress;

    public Camera() {
    }


    public Camera(String id, String name, String model, String resolution, String ipAddress) {
        this.id = id;
        this.name = name;
        this.model = model;
        this.resolution = resolution;
        this.ipAddress = ipAddress;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }


    public String getipAddress() {
        return ipAddress;
    }

    public void setipAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    @Override
    public String toString() {
        return "Camera [ipAddress=" + ipAddress + ", id=" + id + ", model=" + model + ", name=" + name + ", resolution="
                + resolution + "]";
    }
}
