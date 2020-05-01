package service;

import model.Speaker;
import repository.HibernateSpeakerRepisotoryImpl;
import repository.SpeakerRepisotory;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepisotory repisotory = new HibernateSpeakerRepisotoryImpl();

    @Override
    public List<Speaker> findAll() {
        return repisotory.findAll();
    }
}
