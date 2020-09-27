package com.example.demo;
import java.util.*;

import javax.swing.JOptionPane;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/vending") 
@CrossOrigin(origins = "http://localhost:4200"  )
public class SodaController {
	
	
	
	    @Autowired
	    private SodaRepository sodaRep;


	    
	    @GetMapping("/soda")
	    public List<Soda> getAllSoda() {
	    	
	        return sodaRep.findAll();
	    }

	    @PutMapping("/soda/{id}")
	    public ResponseEntity<Soda> soldSoda(@PathVariable(value = "id") Long sodaId,
	          @RequestBody Soda sodaDetails) throws ResourceNotFoundException {
	        Soda soda = sodaRep.findById(sodaId)
	                .orElseThrow(() -> new ResourceNotFoundException("Soda not found for this id :: " + sodaId));
	          
		        System.out.println("\n Time "+(soda.getQty()-1)+""+(sodaDetails.getQty()-1)+" \n");
	                soda.setName(sodaDetails.getName());
	                soda.setQty(soda.getQty()-1);
	                final Soda updatedSoda = sodaRep.save(soda);
	                return ResponseEntity.ok(updatedSoda);
	            }
	    
	   

	    
	    @Autowired
	    private ReportRepository repRep;


	    @PostMapping("/report")
	    public Report createReport(@RequestBody Report report) {
	        return repRep.save(report);
	    }
   
	    
	    @GetMapping("/report")
	    public List<Report> getAllReport() {
	        return repRep.findAll();
	    }
	    
}
