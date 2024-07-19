import java.io.*;

public class SerializationDemo {

    public static void main(String[] args) {
        Customer customer = new Customer("Alice", 30);
        String filename = "customer.ser";

        // Serialization
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
            out.writeObject(customer);
            System.out.println("Customer serialized: " + customer);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialization
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {
            Customer deserializedCustomer = (Customer) in.readObject();
            System.out.println("Customer deserialized: " + deserializedCustomer);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
