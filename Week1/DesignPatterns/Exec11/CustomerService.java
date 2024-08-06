

public class CustomerService {
    private CustomerRepository customerRepository;

    // Constructor Injection
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void findCustomer(String customerId) {
        String customer = customerRepository.findCustomerById(customerId);
        System.out.println("Customer Details: " + customer);
    }
}

