package TallerMecanico;

import java.util.Objects;

public class Vehiculo {
  private final String matricula;
  private final String propietario;

  public Vehiculo(String matricula, String propietario) {
    this.matricula = matricula.toUpperCase();
    this.propietario = propietario.toUpperCase();
  }

  public String getMatricula() {
    return matricula;
  }

  public String getPropietario() {
    return propietario;
  }

  @Override
  public String toString() {
    return "Vehiculo{" +
            "matricula='" + matricula + '\'' +
            ", propietario='" + propietario + '\'' +
            '}';
  }

  public String info(){
    return matricula+" - "+propietario;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Vehiculo vehiculo = (Vehiculo) o;
    return matricula.equals(vehiculo.matricula);
  }

  @Override
  public int hashCode() {
    return Objects.hash(matricula);
  }
}
