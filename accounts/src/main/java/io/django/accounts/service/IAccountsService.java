package io.django.accounts.service;

import io.django.accounts.dto.AccountsDto;
import io.django.accounts.dto.CustomerDto;

public interface IAccountsService {

    /**
     *
     * @param customerDto-CustomerDto Object
     */
    void createAccount(CustomerDto customerDto);
}
