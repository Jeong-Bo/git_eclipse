package test.dao;

import test.domain.RequestTestDTO;
import test.domain.ResponseTestDTO;

public class TestDao {
	
	private ResponseTestDTO response ;
	public TestDao() {
		response = new ResponseTestDTO() ;
	}
	
	public ResponseTestDTO loginRow(RequestTestDTO params) {
		System.out.println("debug >>> dao loginRow parms = " + params);
		if( params.getId().equals("bgjeong") && params.getPwd().equals("bgjeong")) {
			response.setName("정보근");
			return response ;
		}else {
			return null ;
		}
	}

}
