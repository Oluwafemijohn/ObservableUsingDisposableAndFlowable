package com.example.observableusingdisposableandflowable

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import io.reactivex.Observable
import io.reactivex.Flowable

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Flowable

        /**
         *
         * The Flowable is used when there is Backpressure situation
         * i.e the observable is emitting itmes or data moe than the subscriber can handle
         */


        Flowable.just("This is a Flowable From Oluwafemi")
                .subscribe(
                        { value -> println("Received: $value") },
                        { error -> println("Error: $error") },
                        { println("Completed") }
                )




        //Disposable

        /**
         *A Disposable is use to release memory, resources, and threads used by an Observable.
         *
         * the main purpose of disposable is to free up system resources and make your app more stable.
         *
         */
        Observable.just("Apple", "Orange", "Banana")
                .subscribe { v -> println("Received: $v") }.dispose()
    }



}