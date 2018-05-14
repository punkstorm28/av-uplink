package network.api;

import io.reactivex.Completable;
import retrofit2.http.POST;
import retrofit2.http.Streaming;

public interface UplinkInterface {

    @POST
    @Streaming
    Completable streamAudioUplink();
}
