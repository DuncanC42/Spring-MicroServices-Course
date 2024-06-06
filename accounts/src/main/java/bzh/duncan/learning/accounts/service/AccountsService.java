package bzh.duncan.learning.accounts.service;

import bzh.duncan.learning.accounts.dto.CustomerDto;
import bzh.duncan.learning.accounts.entity.Customer;
import bzh.duncan.learning.accounts.mapper.CustomerMapper;
import bzh.duncan.learning.accounts.repository.AccountsRepository;
import bzh.duncan.learning.accounts.repository.CustomerRepository;
import org.springframework.stereotype.Service;

@Service
public interface AccountsService {

    /**
     * @param customerDto
     */
    void createAccount(CustomerDto customerDto);

    CustomerDto fetchAccount(String mobileNumber);

    boolean updateAccount(CustomerDto customerDto);

    boolean deleteAccount(String mobileNumber);

}
