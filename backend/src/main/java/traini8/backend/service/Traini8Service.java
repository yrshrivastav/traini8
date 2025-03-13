package traini8.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import traini8.backend.entity.Traini8;
import traini8.backend.repository.Traini8Repository;

import java.util.List;

@Service
public class Traini8Service {

    @Autowired
    private Traini8Repository trainingCenterRepository;

    public Traini8 createTrainingCenter(Traini8 trainingCenter) {

        trainingCenter.setCreatedOn(System.currentTimeMillis());
        return trainingCenterRepository.save(trainingCenter);
    }

    public List<Traini8> getAllTrainingCenters() {
        return trainingCenterRepository.findAll();
    }
}

