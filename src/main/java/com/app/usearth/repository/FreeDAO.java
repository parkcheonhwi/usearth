package com.app.usearth.repository;

import com.app.usearth.domain.CommentDTO;
import com.app.usearth.domain.PostDTO;
import com.app.usearth.mapper.FreeMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

@Repository
@RequiredArgsConstructor
public class FreeDAO {
    private final FreeMapper freeMapper;
    // 자유게시판 목록
    public List<PostDTO> freeBoardList(){
        return freeMapper.selectByFreeBoard();}

    // 게시판 상세보기
    public Optional<PostDTO> freeBoardRead(Long id){
        return freeMapper.selectByFreeRead(id);}

    // 재활용 글 반환
    public List<PostDTO> findByRecycling(Long id){
        return freeMapper.selectByReadRecycling(id);}

    // 자유게시판 작성
    public void insertPost(PostDTO postDTO){
        freeMapper.insertPost(postDTO);
    }

    public void updatePost(PostDTO postDTO){
        freeMapper.updatePost(postDTO);
    }
    public PostDTO getPostById(Long id){
        return freeMapper.getPostById(id);
    }


    //postId의 댓글 목록
    public List<CommentDTO> selectCommentsByPostId(Long postId) {
        return freeMapper.selectCommentsByPostId(postId);}

    // 댓글 입력
    public void insertComment(CommentDTO comment) {

        freeMapper.insertComment(comment);
    }

    // 댓글 수
    public int selectCommentCountByPostId(Long postId){

        return freeMapper.selectCommentCountByPostId(postId);
    }
}

