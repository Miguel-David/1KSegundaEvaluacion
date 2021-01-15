package TallerMecanico;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Vehiculo {
  private final String matricula;
  private final String propietario;

  private List<Reparacion> reparaciones;

  public Vehiculo(String matricula, String propietario) {
    this.matricula = matricula.toUpperCase();
    this.propietario = propietario.toUpperCase();
    reparaciones=new ArrayList<>();
  }

  public List<Reparacion> getReparaciones() {
    return reparaciones;
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
    return matricula+" - "+propietario+ " tiene: "+reparaciones.size()+" reparaciones.";
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

  public void anyadeReparacion(Reparacion nuevaReparacion) {
    reparaciones.add(nuevaReparacion);
  }

  public List<Reparacion> getReparacionesConClave(String palabraBuscar) {
    List<Reparacion> salida=new ArrayList<>();
    for (Reparacion r:reparaciones) {
      String descripcionMAYUS=r.getDescripcion().toUpperCase();
      if(descripcionMAYUS.indexOf(palabraBuscar.toUpperCase())>=0){
        salida.add(r);
      }
    }
    return salida;
  }
}
