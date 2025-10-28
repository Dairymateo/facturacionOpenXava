package com.yourcompany.facturacion.model;

import java.math.*;
import java.time.*;

import javax.persistence.*;

import org.openxava.annotations.*;
import org.openxava.model.*;

import lombok.*;



@Entity @Getter @Setter
public class YourFirstEntity extends Identifiable {
	
	@Column(length=50) @Required
	String description;
	
	LocalDate date;
	
	BigDecimal amount;

}
