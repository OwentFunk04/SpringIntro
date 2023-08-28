@Entity
public class FormData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    // Getters, setters, constructors
}

@Repository
public interface FormDataRepository extends JpaRepository<FormData, Long> {
}
