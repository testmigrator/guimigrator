import SwiftUI

struct Widget_4x1: View {
  var body: some View {
    ZStack {
      HStack(alignment: .center, spacing: 0) {
        Text("Account name").foregroundColor(Color.white).multilineTextAlignment(.center).frame(maxWidth: .infinity, alignment: .center).frame(maxWidth: .infinity).padding(.leading, 12.0)
        Text("").font(.system(size: 20)).foregroundColor(Color.black).multilineTextAlignment(.center).padding(.leading, 8.0).padding(.trailing, 8.0)
        Button(action: { /* TODO */ }) {
          Image("content_new_holo_light")
        }
        .background(Image("appwidget_bg").resizable().scaledToFill())
        .frame(width: 48.0)
        .padding(.leading, 12.0)
        .padding(.trailing, 12.0)
        Button(action: { /* TODO */ }) {
          Image("action_about_holo_light")
        }
        .background(Image("appwidget_bg").resizable().scaledToFill())
        .frame(width: 48.0)
        .padding(.leading, 12.0)
        .padding(.trailing, 12.0)
      }
      .background(Image("appwidget_dark_bg").resizable().scaledToFill())
      .frame(maxWidth: .infinity, maxHeight: .infinity)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
    .padding(8.0)
  }
}

struct Widget_4x1_Previews: PreviewProvider {
  static var previews: some View {
    Widget_4x1()
  }
}
