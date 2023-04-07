package in.bank.Insurance.model;

//import java.math.BigInteger;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Insurance {
	@Id
	@Column(name="insurance_number")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int insuranceNumber;
	@Column(name="customer_id")
    private int customerId;
	@Column(name="insurance_type")
    private String insuranceType;
	@Column(name="insured_amount")
    private int insuredAmount;
	@Column(name="insurance_end_date")
    private Date insuranceEndDate;
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public int getInsuranceNumber() {
		return insuranceNumber;
	}
	public void setInsuranceNumber(int insuranceNumber) {
		this.insuranceNumber = insuranceNumber;
	}
	public String getInsuranceType() {
		return insuranceType;
	}
	public void setInsuranceType(String insuranceType) {
		this.insuranceType = insuranceType;
	}
	
	public Date getInsuranceEndDate() {
		return insuranceEndDate;
	}
	public void setInsuranceEndDate(Date insuranceEndDate) {
		this.insuranceEndDate = insuranceEndDate;
	}
	public int getInsuredAmount() {
		return insuredAmount;
	}
	public void setInsuredAmount(int insuredAmount) {
		this.insuredAmount = insuredAmount;
	}

}
