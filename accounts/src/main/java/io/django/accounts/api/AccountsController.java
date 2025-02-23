package io.django.accounts.api;

import io.django.accounts.constants.AcountsConstants;
import io.django.accounts.dto.AccountsDto;
import io.django.accounts.dto.ResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api", produces = {MediaType.APPLICATION_JSON_VALUE})
public class AccountsController {

    @PostMapping("/create")
    public ResponseEntity<ResponseDto>createAccount(@RequestBody AccountsDto accountsDto){
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(new ResponseDto(AcountsConstants.STATUS_201, AcountsConstants.MESSAGE_201));
    }

}
