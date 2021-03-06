package com.giphytest.bean

import java.io.Serializable

import io.objectbox.annotation.Entity
import io.objectbox.annotation.Generated
import io.objectbox.annotation.Id
import io.objectbox.annotation.apihint.Internal

@Entity
class GiphyImageInfo : Serializable {

    @Id
    var id: Long = 0

    var giphyId: String? = null
    var url: String? = null
    var videoUrl: String? = null
    var totalUpVote: String? = null
    var totalDownVote: String? = null


    @Generated(2062543097)
    @Internal
            /** This constructor was generated by ObjectBox and may change any time.  */
    constructor(id: Long, giphyId: String, url: String, videoUrl: String,
                totalUpVote: String, totalDownVote: String) {
        this.id = id
        this.giphyId = giphyId
        this.url = url
        this.videoUrl = videoUrl
        this.totalUpVote = totalUpVote
        this.totalDownVote = totalDownVote
    }

    @Generated(831393918)
    constructor() {
    }

    override fun equals(o: Any?): Boolean {
        if (this === o) {
            return true
        }

        if (o == null || javaClass != o.javaClass) {
            return false
        }

        val that = o as GiphyImageInfo?

        return if (url != null) url == that!!.url else that!!.url == null

    }

    override fun hashCode(): Int {
        return if (url != null) url!!.hashCode() else 0
    }
}
