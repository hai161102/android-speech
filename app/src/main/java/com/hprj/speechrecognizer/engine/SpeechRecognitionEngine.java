package com.hprj.speechrecognizer.engine;

import android.content.Context;
import android.speech.RecognitionListener;

import com.hprj.speechrecognizer.GoogleVoiceTypingDisabledException;
import com.hprj.speechrecognizer.SpeechDelegate;
import com.hprj.speechrecognizer.SpeechRecognitionNotAvailable;
import com.hprj.speechrecognizer.ui.SpeechProgressView;

import java.util.Locale;

public interface SpeechRecognitionEngine extends RecognitionListener {

    void init(Context context);

    void clear();

    String getPartialResultsAsString();

    void initSpeechRecognizer(Context context);

    void startListening(SpeechProgressView progressView, SpeechDelegate delegate) throws SpeechRecognitionNotAvailable, GoogleVoiceTypingDisabledException;

    void stopListening();

    void returnPartialResultsAndRecreateSpeechRecognizer();

    void setPartialResults(boolean getPartialResults);

    void shutdown();

    boolean isListening();

    Locale getLocale();

    void setLocale(Locale locale);

    void setPreferOffline(boolean preferOffline);

    void setTransitionMinimumDelay(long milliseconds);

    void setStopListeningAfterInactivity(long milliseconds);

    void setCallingPackage(String callingPackage);

    void unregisterDelegate();
}
