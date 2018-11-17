package br.unifacisa.webServiceNutrisim.services;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import br.unifacisa.webServiceNutrisim.abstracts.ServiceAbs;
import br.unifacisa.webServiceNutrisim.domains.entities.DayFoods;
import br.unifacisa.webServiceNutrisim.repositories.DayFoodsRepository;

@Service
public class DayFoodsService extends ServiceAbs<DayFoods> {

	@Autowired
	DayFoodsRepository repository;

	public DayFoodsService(JpaRepository<DayFoods, Long> repository) {
		super(repository);
	}

//	public List<DayFoods> resumeByMonth(int mes) {
//		Date data1;
//		Date data2;
//		switch (mes) {
//		case 1:
//			data1 = new LocalDate() 
//			data2 = new Date(01/02); 
//			break;
//		case 2:
//			data1 = new Date(01/02); 
//			data2 = new Date(01/03);
//			break;
//		case 3:
//
//			data1 = new Date(01/03); 
//			data2 = new Date(01/04);
//			break;
//		case 4:
//
//			data1 = new Date(01/04); 
//			data2 = new Date(01/05);
//			break;
//		case 5:
//
//			data1 = new Date(01/05); 
//			data2 = new Date(01/06);
//
//			break;
//		case 6:
//
//			data1 = new Date(01/06); 
//			data2 = new Date(01/07);
//
//			break;
//		case 7:
//
//			data1 = new Date(01/07); 
//			data2 = new Date(01/08);
//
//			break;
//		case 8:
//
//			data1 = new Date(01/08); 
//			data2 = new Date(01/09);
//
//			break;
//		case 9:
//
//			break;
//		case 10:
//
//			break;
//		case 11:
//
//			break;
//		case 12:
//
//			break;
//
//		default:
//			break;
//		}
//	}

}
