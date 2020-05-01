package service;

import model.Speaker;
import repository.SpeakerRepisotory;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepisotory repisotory;

    @Override
    public List<Speaker> findAll() {
        return repisotory.findAll();
    }

    public void setRepisotory(SpeakerRepisotory repisotory) {
        this.repisotory = repisotory;
    }
}
