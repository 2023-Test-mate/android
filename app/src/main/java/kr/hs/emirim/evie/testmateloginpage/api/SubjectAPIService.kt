package kr.hs.emirim.evie.testmateloginpage.api

import kr.hs.emirim.evie.testmateloginpage.subject.data.Subject
import kr.hs.emirim.evie.testmateloginpage.subject.data.SubjectRequest
import kr.hs.emirim.evie.testmateloginpage.subject.data.SubjectResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path


interface SubjectAPIService {
    @GET("/api/subject/list/{grade}")
    fun getSubjects(@Path("grade") grade: Int) : Call<List<SubjectRequest>>

    @POST("/api/subject")
    fun createSubject(@Body subject : Subject) : Call<SubjectResponse>
}