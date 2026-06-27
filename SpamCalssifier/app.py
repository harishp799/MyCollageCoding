import streamlit as st
import joblib

import os

base_dir = os.path.dirname(os.path.abspath(__file__))
model_path = os.path.join(base_dir, "model", "spam_model.pkl")
model = joblib.load(model_path)

st.title("Email Spam Classifier")

msg = st.text_area("Enter your message:")

if st.button("Predict"):
    if msg.strip() == "":
        st.warning("Please enter a message")
    else:
        prediction = model.predict([msg])[0]

        if prediction == 1:
            st.error("Spam Message")
        else:
            st.success("Not Spam")