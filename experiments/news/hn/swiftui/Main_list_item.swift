import SwiftUI

struct Main_list_item: View {
  var body: some View {
    HStack(alignment: .center, spacing: 0) {
      VStack(alignment: .leading, spacing: 0) {
        Spacer()
        Text("No Topic Defined").font(.system(size: 18)).foregroundColor(Color(red: 0.14901960784313725, green: 0.13725490196078433, blue: 0.12941176470588237, opacity: 1))
        HStack(alignment: .center, spacing: 0) {
          Text("").font(.system(size: 12)).foregroundColor(Color(red: 0.47058823529411764, green: 0.4392156862745098, blue: 0.403921568627451, opacity: 1)).multilineTextAlignment(.center).background(Image("points_roundedrect").resizable().scaledToFill())
          Text("No URL Defined").font(.system(size: 12)).foregroundColor(Color(red: 0.47058823529411764, green: 0.4392156862745098, blue: 0.403921568627451, opacity: 1))
        }
        .padding(.top, 5.0)
        Spacer()
      }
      .background(Color(red: 1, green: 0.9294117647058824, blue: 0.8588235294117647, opacity: 1))
      .frame(maxWidth: .infinity, maxHeight: .infinity)
      .padding(.top, 8.0)
      .padding(.bottom, 8.0)
      VStack(alignment: .center, spacing: 0) {
        Button(action: { }) {
          Text("0").font(.system(size: 18)).foregroundColor(Color(red: 0.44313725490196076, green: 0.4117647058823529, blue: 0.3803921568627451, opacity: 1)).multilineTextAlignment(.center).frame(maxWidth: .infinity, alignment: .center)
        }
        .disabled(false)
        .background(Image("bubble_patch").resizable().scaledToFill())
      }
      .background(Color(red: 0.984313725490196, green: 0.9137254901960784, blue: 0.8470588235294118, opacity: 1))
      .frame(maxHeight: .infinity)
      .padding(8.0)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Main_list_item_Previews: PreviewProvider {
  static var previews: some View {
    Main_list_item()
  }
}
