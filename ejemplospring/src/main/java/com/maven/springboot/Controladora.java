package com.maven.springboot;

import com.maven.springboot.beans.Auto;
import com.maven.springboot.beans.Servicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mauro on 24/05/17.
 */
@RestController
@RequestMapping("/")
public class Controladora {

    @Autowired
    Servicio servi;

    @RequestMapping(value = "helloworld", method = RequestMethod.GET, produces = MediaType.TEXT_PLAIN_VALUE)
    public String getHelloWorld()
    {
        return "Hello World!";
    }

    @RequestMapping(value = "/autos/", method = RequestMethod.GET)
    public @ResponseBody ResponseEntity<List<Auto>> getAutos() {
        List<Auto> listaautos = servi.getautos();
        if (listaautos.size() > 0) {
            return new ResponseEntity<List<Auto>>(listaautos, HttpStatus.OK);
        } else {
            return new ResponseEntity<List<Auto>>(HttpStatus.NO_CONTENT);
        }
    }

    @RequestMapping(value = "/autos/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody ResponseEntity<Auto> getAutoxId(@PathVariable("id") String id)
    {
        Auto auto = servi.getautoxid(id);
        if(auto!=null)
        {
            return new ResponseEntity<Auto>(auto, HttpStatus.OK);
        }
        else
        {
            return new ResponseEntity<Auto>(HttpStatus.NOT_FOUND);
        }

    }

    @RequestMapping(value = "/autos", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody ResponseEntity<Auto> getByMarca(@RequestParam ("marca") String brand)
    {
        Auto auto = servi.getautoxmarca(brand);
        if(auto!=null)
        {
            return new ResponseEntity<Auto>(auto, HttpStatus.OK);
        }
        else
        {
            return new ResponseEntity<Auto>(HttpStatus.NOT_FOUND);
        }
        
    }

}