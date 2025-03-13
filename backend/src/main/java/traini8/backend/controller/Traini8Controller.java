package traini8.backend.controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import traini8.backend.entity.Traini8;
import traini8.backend.service.Traini8Service;

import java.util.List;

@RestController
@RequestMapping("/api/training-centers")
public class Traini8Controller {

    @Autowired
    private Traini8Service trainingCenterService;

    // POST: Create a new training center
    @PostMapping
    public ResponseEntity<Traini8> createTrainingCenter(@Valid @RequestBody Traini8 trainingCenter) {
        Traini8 savedCenter = trainingCenterService.createTrainingCenter(trainingCenter);
        return new ResponseEntity<>(savedCenter, HttpStatus.CREATED);
    }

    // GET: List all training centers
    @GetMapping
    public ResponseEntity<List<Traini8>> getAllTrainingCenters() {
        List<Traini8> centers = trainingCenterService.getAllTrainingCenters();
        return new ResponseEntity<>(centers, HttpStatus.OK);
    }
}

