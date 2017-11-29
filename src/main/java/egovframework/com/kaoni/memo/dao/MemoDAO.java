package egovframework.com.kaoni.memo.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.com.kaoni.memo.vo.MemoVO;
import egovframework.rte.psl.dataaccess.EgovAbstractDAO;

@Repository("MemoDAO")
public class MemoDAO extends EgovAbstractDAO {
	
	/***
	 * memo생성
	 * @param memoVO
	 * @return true->성공, false->실패
	 */
	public boolean createMemo(MemoVO memoVO) throws Exception{
		
		return false;
	}
	
	/***
	 * memo수정
	 * @param memoVO
	 * @return true->성공, false->실패
	 */
	public boolean update(MemoVO memoVO) throws Exception{
		
		return false;
	}
	
	/***
	 * memo삭제
	 * @param memoNo
	 * @return true->성공, false->실패
	 */
	public boolean delete(int memoNo) throws Exception{
		
		return false;
	}

	/***
	 * memo리스트 가져오기
	 * @param tabNo
	 * @return List<MemoVo>
	 */
	public List<MemoVO> getList(int tabNo) throws Exception{
		
		return null;
	}
}
