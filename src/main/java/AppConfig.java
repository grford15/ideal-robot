import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import repository.HibernateSpeakerRepisotoryImpl;
import repository.SpeakerRepisotory;
import service.SpeakerService;
import service.SpeakerServiceImpl;

@Configuration
public class AppConfig {

    @Bean(name = "speakerService")
    public SpeakerService getSpeakerService() {
        SpeakerServiceImpl service = new SpeakerServiceImpl();
        service.setRepisotory(getSpeakerRepistory());
        return service;
    }

    @Bean(name = "speakerRepository")
    public SpeakerRepisotory getSpeakerRepistory() {
        return new HibernateSpeakerRepisotoryImpl();
    }
}
