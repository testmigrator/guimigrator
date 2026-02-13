import SwiftUI

struct Take_name_layout: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      Text("What is your name?").font(.system(size: 30)).foregroundColor(Color(red: 1, green: 1, blue: 1, opacity: 1)).multilineTextAlignment(.center).frame(maxWidth: .infinity, alignment: .center).padding(.top, 50.0)
      Text("आपका नाम क्या है?").font(.system(size: 30)).foregroundColor(Color(red: 1, green: 1, blue: 1, opacity: 1)).multilineTextAlignment(.center).frame(maxWidth: .infinity, alignment: .center)
      TextField("", text: .constant("")).frame(maxWidth: .infinity).padding(.top, 50.0).frame(maxWidth: .infinity, alignment: .center)
      Group {
      Button(action: { }) {
        Text("OK").frame(maxWidth: .infinity, alignment: .leading)
      }
      .disabled(false)
      .background(Color(red: 1, green: 0.8941176470588236, blue: 0.8823529411764706, opacity: 1))
      .frame(maxWidth: .infinity)
      .padding(.leading, 20.0)
      .padding(.trailing, 20.0)
      .padding(.top, 30.0)
      }
      .frame(maxWidth: .infinity, alignment: .trailing)
      Image("hello").padding(.leading, 20.0).padding(.trailing, 20.0).frame(maxWidth: .infinity, alignment: .center)
    }
    .background(Image("rsz_home_bg").resizable().scaledToFill())
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Take_name_layout_Previews: PreviewProvider {
  static var previews: some View {
    Take_name_layout()
  }
}
