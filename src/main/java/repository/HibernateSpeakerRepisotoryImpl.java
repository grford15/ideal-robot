package repository;

import model.Speaker;

import java.util.ArrayList;
import java.util.List;

public class HibernateSpeakerRepisotoryImpl implements SpeakerRepisotory {

    @Override
    public List<Speaker> findAll() {
        List<Speaker> speakers = new ArrayList<Speaker>();

        Speaker speaker = new Speaker();

        speaker.setFirstName("Greg");
        speaker.setLastName("Rutherford");

        speakers.add(speaker);

        return speakers;
    }
}
