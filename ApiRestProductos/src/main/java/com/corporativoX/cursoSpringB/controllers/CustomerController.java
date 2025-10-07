package com.corporativoX.cursoSpringB.controllers;


import com.corporativoX.cursoSpringB.domain.Customer;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/clientes")
public class CustomerController {

    private List<Customer> customers = new ArrayList<>(Arrays.asList(
            new Customer(123, "Jose Maria", "josema12", "contrasena123"),
            new Customer(456, "Juan perez", "juanillo", "juanill45"),
            new Customer(789, "Maria Jesus", "MJ", "mj159"),
            new Customer(159, "Laura Sanchez", "lauras", "laur1532")

    ));


    @GetMapping
    //@RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Customer>> getCustomers() {

        return ResponseEntity.ok(customers);

    }

    @GetMapping("/{username}")
    //@RequestMapping(value = "/{username}", method =RequestMethod.GET)
    public ResponseEntity<?> getClientes(@PathVariable String username) {

        for (Customer c : customers) {
            if (c.getUsername().equalsIgnoreCase(username)) {

                return ResponseEntity.ok(c);

            }

        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Cliente no encontrado con username: " + username);

    }

    @PostMapping
    //@RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> postClientes(@RequestBody Customer customer) {

        customers.add(customer);

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{username}")
                .buildAndExpand(customer.getUsername())
                .toUri();

        //return ResponseEntity.created(location).build();
        return ResponseEntity.created(location).body(customer);

    }

    @PutMapping
    //@RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity<?> putClientes(@RequestBody Customer customer) {
        for (Customer c : customers) {
            if (c.getID() == customer.getID()) {
                c.setName(customer.getName());
                c.setUsername(customer.getUsername());
                c.setPassword(customer.getPassword());

                return ResponseEntity.noContent().build();
            }
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    //@RequestMapping(value = ("/{id}"), method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteClientes(@PathVariable int id) {
        for (Customer c : customers) {
            if (c.getID() == id) {
                customers.remove(c);
                return ResponseEntity.noContent().build();
            }
        }
        return ResponseEntity.notFound().build();
    }

    @PatchMapping
    //@RequestMapping(method = RequestMethod.PATCH)
    public ResponseEntity<?> patchClientes(@RequestBody Customer customer) {
        for (Customer c : customers) {
            if (c.getID() == customer.getID()) {

                if (customer.getName() != null) {

                    c.setName(customer.getName());
                }

                if (c.getUsername() != null) {

                    c.setUsername(customer.getUsername());
                }

                if (customer.getPassword() != null) {
                    c.setPassword(customer.getPassword());
                }
                return ResponseEntity.ok("Cliente modificado satisfactoriamente: " + customer.getUsername());
            }

        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Cliente no encontrado con el username: " + customer.getID());
    }
}
