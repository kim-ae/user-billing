package br.com.kimae.usermanager.web;

import br.com.kimae.usermanager.domain.Bill;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BillController {

    @PostMapping(value = {"/", ""}, produces = "application/vnd.kimae.bill.v1+json")
    public Bill create(final BillCreationRequest request){

        return Bill.builder().build();
    }

    @GetMapping(value = {"/{userId}"}, produces = "application/vnd.kimae.bill.v1+json")
    public Bill get(final String billId){
        return Bill.builder().build();
    }
}
