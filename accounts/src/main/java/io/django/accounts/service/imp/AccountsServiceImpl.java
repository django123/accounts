package io.django.accounts.service.imp;

import io.django.accounts.dto.CustomerDto;
import io.django.accounts.repository.AccountsRepository;
import io.django.accounts.repository.CustomerRepository;
import io.django.accounts.service.IAccountsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AccountsServiceImpl implements IAccountsService {
    private AccountsRepository accountsRepository;
    private CustomerRepository customerRepository;

    /**
     * @param customerDto -CustomerDto Object
     */
    @Override
    public void createAccount(CustomerDto customerDto) {

    }
}
