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
    public @ResponseBody ResponseEntity<List<Auto>> getAutos()
    {
        return new ResponseEntity<List<Auto>>(servi.getautos(), HttpStatus.OK);
    }

    @RequestMapping(value = "/autos/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody ResponseEntity<Auto> getAutoxId(@PathVariable("id") String id)
    {
        return new ResponseEntity<Auto>(servi.getautoxid(id), HttpStatus.OK);
    }

    @RequestMapping(value = "/autos", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody ResponseEntity<Auto> getByMarca(@RequestParam ("marca") String brand)
    {
        return new ResponseEntity<Auto>(servi.getautoxmarca(brand), HttpStatus.OK);
    }

}