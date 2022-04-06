package recipes.business;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Recipe")
public class Recipe {

    @JsonIgnore
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Column(name = "name")
    private String name;

    @NotBlank
    @Column(name = "description")
    private String description;

    @Size(min = 1)
    @NotEmpty
    @Column(name = "ingredients")
    @ElementCollection
    private List<String> ingredients;

    @Size(min = 1)
    @NotEmpty
    @Column(name = "directions")
    @ElementCollection
    private List<String> directions;
}
