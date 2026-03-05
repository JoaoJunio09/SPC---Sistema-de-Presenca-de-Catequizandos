package br.com.joaojuniodev.spc.data.dtos.response;

import java.util.Objects;

public class CatequistaResponseDTO {

    private Long id;
    private String fullName;

    public CatequistaResponseDTO() {}

    public CatequistaResponseDTO(Long id, String fullName) {
        this.id = id;
        this.fullName = fullName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        CatequistaResponseDTO that = (CatequistaResponseDTO) o;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getFullName(), that.getFullName());
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(getId());
        result = 31 * result + Objects.hashCode(getFullName());
        return result;
    }
}
