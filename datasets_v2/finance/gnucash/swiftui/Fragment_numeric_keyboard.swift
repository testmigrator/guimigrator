import SwiftUI

struct Fragment_numeric_keyboard: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      VStack(alignment: .center, spacing: 0) {
        Image("ic_launcher")
        HStack(alignment: .center, spacing: 0) {
          TextField("*", text: .constant("")).frame(maxHeight: .infinity)
          TextField("*", text: .constant("")).frame(maxHeight: .infinity)
          TextField("*", text: .constant("")).frame(maxHeight: .infinity)
          TextField("*", text: .constant("")).frame(maxHeight: .infinity)
        }
        .frame(maxWidth: .infinity)
        .padding(.top, 25.0)
        Text("Enter Passcode").font(.system(size: 15)).multilineTextAlignment(.center)
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity)
      VStack(alignment: .leading, spacing: 0) {
        HStack(alignment: .center, spacing: 0) {
          VStack(alignment: .center, spacing: 0) {
            Text("1")
            Text("​")
          }
          .background(Image("numeric_button").resizable().scaledToFill())
          .frame(width: 70.0, height: 70.0)
          .padding(10.0)
          VStack(alignment: .center, spacing: 0) {
            Text("2")
            Text("ABC")
          }
          .background(Image("numeric_button").resizable().scaledToFill())
          .frame(width: 70.0, height: 70.0)
          .padding(10.0)
          VStack(alignment: .center, spacing: 0) {
            Text("3")
            Text("DEF").frame(height: 73.0)
          }
          .background(Image("numeric_button").resizable().scaledToFill())
          .frame(width: 70.0, height: 70.0)
          .padding(10.0)
        }
        .frame(maxWidth: .infinity)
        HStack(alignment: .center, spacing: 0) {
          VStack(alignment: .center, spacing: 0) {
            Text("4")
            Text("GHI")
          }
          .background(Image("numeric_button").resizable().scaledToFill())
          .frame(width: 70.0, height: 70.0)
          .padding(10.0)
          VStack(alignment: .center, spacing: 0) {
            Text("5")
            Text("JKL")
          }
          .background(Image("numeric_button").resizable().scaledToFill())
          .frame(width: 70.0, height: 70.0)
          .padding(10.0)
          VStack(alignment: .center, spacing: 0) {
            Text("6")
            Text("MNO")
          }
          .background(Image("numeric_button").resizable().scaledToFill())
          .frame(width: 70.0, height: 70.0)
          .padding(10.0)
        }
        .frame(maxWidth: .infinity)
        HStack(alignment: .center, spacing: 0) {
          VStack(alignment: .center, spacing: 0) {
            Text("7")
            Text("PQRS")
          }
          .background(Image("numeric_button").resizable().scaledToFill())
          .frame(width: 70.0, height: 70.0)
          .padding(10.0)
          VStack(alignment: .center, spacing: 0) {
            Text("8")
            Text("TUV")
          }
          .background(Image("numeric_button").resizable().scaledToFill())
          .frame(width: 70.0, height: 70.0)
          .padding(10.0)
          VStack(alignment: .center, spacing: 0) {
            Text("9")
            Text("WXYZ")
          }
          .background(Image("numeric_button").resizable().scaledToFill())
          .frame(width: 70.0, height: 70.0)
          .padding(10.0)
        }
        .frame(maxWidth: .infinity)
        HStack(alignment: .center, spacing: 0) {
          Spacer()
          .frame(width: 70.0, height: 70.0)
          .padding(10.0)
          VStack(alignment: .center, spacing: 0) {
            Text("0")
            Text("+")
          }
          .background(Image("numeric_button").resizable().scaledToFill())
          .frame(width: 70.0, height: 70.0)
          .padding(10.0)
          Button(action: { /* TODO */ }) {
            Image("ic_action_backspace")
          }
          .background(Color(red: 0, green: 0, blue: 0, opacity: 0))
          .frame(width: 70.0, height: 70.0)
          .padding(10.0)
        }
        .frame(maxWidth: .infinity)
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Fragment_numeric_keyboard_Previews: PreviewProvider {
  static var previews: some View {
    Fragment_numeric_keyboard()
  }
}
