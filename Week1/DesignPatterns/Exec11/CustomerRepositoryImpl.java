

public class CustomerRepositoryImpl implements CustomerRepository {
    @Override
    public String findCustomerById(String customerId) {
        // In a real-world scenario, this might query a database.
        // Here, we will just return a dummy customer name.
        return "John Doe (Customer ID: " + customerId + ")";
    }
}
