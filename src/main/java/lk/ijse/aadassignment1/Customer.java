import java.io.Serializable;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
public class Customer implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private int age;

}
