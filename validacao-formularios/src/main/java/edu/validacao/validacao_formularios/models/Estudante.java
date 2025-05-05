package edu.validacao.validacao_formularios.models;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDate;

public class Estudante {

    @NotNull(message = "O nome não pode estar vazio.")
    @Size(max = 100, min = 1, message = "Nome inválido.")
    private String nome;
    private LocalDate dataNascimento;

    @Size(max = 100, min = 1, message = "A matrícula deve conter mais de 1 caractere")
    private String matricula;

    private MultipartFile avatar;

    public MultipartFile getAvatar() {
        return avatar;
    }

    public void setAvatar(MultipartFile avatar) {
        this.avatar = avatar;
    }

    public Estudante() {
    }

    public Estudante(String nome, LocalDate dataNascimento, String matricula) {
        this.dataNascimento = dataNascimento;
        this.nome = nome;
        this.matricula = matricula;


    }
    public String getNome() {
        return nome;
    }


    public void setNome(String nome){
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }


}
