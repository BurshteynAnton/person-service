package telran.java53.person.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import telran.java53.person.dto.*;
import telran.java53.person.service.PersonService;

import java.util.List;

@RestController
@RequestMapping("/person")
@RequiredArgsConstructor
public class PersonController {
    final PersonService personService;

    @PostMapping
    public Boolean addPerson(@RequestBody PersonDto personDto) {
        return personService.addPerson(personDto);
    }

    @GetMapping("/{id}")
    public PersonDto findPersonById(@PathVariable Integer id) {
        return personService.findPersonById(id);
    }

    @DeleteMapping("/{id}")
    public PersonDto removePerson(@PathVariable Integer id) {
        return personService.removePerson(id);
    }

    @PutMapping("/{id}/name/{name}")
    public PersonDto updatePersonName(@PathVariable Integer id, @PathVariable String name) {
        return personService.updatePersonName(id, name);
    }

    @PutMapping("/{id}/address")
    public PersonDto updatePersonAddress(@PathVariable Integer id, @RequestBody AddressDto addressDto) {
        return personService.updatePersonAddress(id, addressDto);
    }

    @GetMapping("/city/{city}")
    public PersonDto[] findPersonsByCity(@PathVariable String city) {
        return personService.findPersonsByCity(city);
    }

    @GetMapping("/name/{name}")
    public PersonDto[] findPersonsByName(@PathVariable String name) {
        return personService.findPersonsByName(name);
    }

    @GetMapping("/ages/{min}/{max}")
    public PersonDto[] findPersonsBetweenAge(@PathVariable Integer min, @PathVariable Integer max) {
        return personService.findPersonsBetweenAge(min, max);
    }

    @GetMapping("/population/city")
    public Iterable<CityPopulationDto> getCitiesPopulation() {
        return personService.getCitiesPopulation();
    }

    @GetMapping("/children")
    public Iterable<ChildDto> getAllChildren() {
        return personService.getAllChildren();
    }

    @GetMapping("/salary/{min}/{max}")
    public ResponseEntity<List<EmployeeDto>> findEmployeesBySalary(@PathVariable int min, @PathVariable int max) {
        List<EmployeeDto> employees = personService.findEmployeesBySalary(min, max);
        return ResponseEntity.ok(employees);
    }
}