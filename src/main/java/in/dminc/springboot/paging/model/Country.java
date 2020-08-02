package in.dminc.springboot.paging.model;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "countries")
public class Country {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private Long population;

	public Country() {
		System.out.println("Country default constructor..!!");
	}

	public Country(Long id, String name, Long population) {
		super();
		this.setId(id);
		this.setName(name);
		this.setPopulation(population);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getPopulation() {
		return population;
	}

	public void setPopulation(Long population) {
		this.population = population;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}

		Country country = (Country) obj;
		return population == country.getPopulation() && Objects.equals(id, country.getId())
				&& Objects.equals(name, country.getName());
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, population);
	}

	@Override
	public String toString() {

		final StringBuilder sb = new StringBuilder();
		sb.append("id => " + id).append(" : ");
		sb.append("name => " + name).append(" : ");
		sb.append("population => " + population);

		return sb.toString();
	}
}
