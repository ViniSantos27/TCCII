package tcc.fundatec.org.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;
import java.time.LocalDate;

@Entity
@Table(name = "clientes")
@Data
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "Nome não pode ser vazio")
    private String nome;

    @NotEmpty(message = "CPF não pode ser vazio")
    @Size(min = 11, max = 11, message = "CPF deve ter 11 dígitos")
    private String cpf;

    private LocalDate dataNascimento;

    private String logradouro;

    private String complemento;

    @NotEmpty(message = "CEP não pode ser vazio")
    private String cep;

    private String telefone;

    @Email(message = "Email inválido")
    private String email;

    public void setId(Long id) {
    }
}
